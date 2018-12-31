<template>
    <div class="login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="/"><b>RESTAURANT</b></a>
            </div>
            <!-- /.login-logo -->
            <div class="login-box-body">
                <p class="login-box-msg">Đăng nhập để tiếp tục</p>
                <form @submit.prevent="submitForm">
                    <div v-show="errorMessage" class="alert alert-danger failed">{{ errorMessage }}</div>
                    <div class="form-group has-feedback">
                        <input type="text" v-model="form.username" class="form-control" placeholder="Email hoặc tên đăng nhập">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" v-model="form.password" class="form-control" placeholder="Mật khẩu">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">
                            <div class="form-group">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> Duy trì đăng nhập
                                    </label>
                                </div>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">Đăng nhập</button>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>

                <a href="#">Quên mật khẩu</a><br>
                <router-link to="/register" class="text-center">Đăng ký thành viên mới</router-link>

            </div>
            <!-- /.login-box-body -->
        </div>
        <!-- /.login-box -->
    </div>

</template>

<script>
    import { required } from 'vuelidate/lib/validators';
    import authenticationService from '../services/authentication';
    export default {
        name: "LoginPage",
        data() {
            return {
                form: {
                    username: '',
                    password: '',
                },
                errorMessage: ''
            }
        },
        methods: {
            submitForm() {
                this.$v.$touch();
                if(this.$v.$invalid) {
                    return;
                }
                authenticationService.authenticate(this.form).then(() => {
                    this.$router.push({name: 'home'});
                }).catch(error => {
                    console.log(JSON.stringify(this.form));
                    this.errorMessage = error.message;
                });
            }
        },
        validations: {
            form: {
                username: {
                    required
                },
                password: {
                    required
                }
            }
        }
    }
</script>

<style scoped>
.login-page {
    position: fixed;
    width: 100vw;
    height: 100vh;
    background: #d2d6de;
}
</style>