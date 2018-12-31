<template>
    <div class="register-page">
        <div class="register-box">
            <div class="register-logo">
                <a href="#"><b>RESTAURANT</b></a>
            </div>

            <div class="register-box-body">
                <p class="login-box-msg">Đăng ký thành viên mới</p>

                <form @submit.prevent="submitForm">
                    <div v-show="errorMessage" class="alert alert-danger failed">{{ errorMessage }}</div>
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" v-model="form.fullName" placeholder="Họ tên">
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <div class="row">
                            <div class="col-xs-6">
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="gender" value="M" v-model="form.gender">
                                        Nam
                                    </label>
                                </div>

                            </div>
                            <div class="col-xs-6">
                                <div class="radio">
                                    <label>
                                        <input type="radio" name="gender" value="F" v-model="form.gender">
                                        Nữ
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" v-model="form.username" placeholder="Tên đăng nhập">
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="email" class="form-control" v-model="form.email" placeholder="Email">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" v-model="form.password" placeholder="Mật khẩu">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" v-model="form.confirmPassword" placeholder="Nhập lại mật khẩu">
                        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">
                            <div class="form-group">
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" v-model="form.remember"> Tôi đồng ký <a href="#">điều khoản</a>
                                    </label>
                                </div>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">Đăng ký</button>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>
                <router-link to="/login" class="text-center">Tôi đã có tài khoản</router-link>
            </div>
            <!-- /.form-box -->
        </div>
        <!-- /.register-box -->
    </div>
</template>

<script>
    import { required, email, minLength, maxLength, sameAs} from 'vuelidate/lib/validators';
    import registrationService from '../services/registration';
    export default {
        name: "RegisterPage",
        data() {
            return {
                form: {
                    fullName: '',
                    username: '',
                    email: '',
                    password: '',
                    confirmPassword: '',
                    gender: 'M',
                    remember: false,
                },
                errorMessage: '',
            }
        },
        methods: {
            submitForm() {
                this.$v.$touch();
                if (this.$v.$invalid) {
                    return;
                }
                registrationService.register(this.form).then(() => {
                    this.$router.push({name: 'LoginPage'});
                }).catch(error => {
                    this.errorMessage = 'Đăng ký thất bại. Lý do: ' + (error.message ? error.message : 'Không rõ') + '.';
                });
            }
        },
        validations: {
            form: {
                fullName: {
                    required,
                    minLength: minLength(2),
                    maxLength: maxLength(100),
                },
                username: {
                    required,
                    minLength: minLength(2),
                    maxLength: maxLength(50),
                },
                email: {
                    required,
                    email,
                    maxLength: maxLength(50)
                },
                password: {
                    required,
                    minLength: minLength(6),
                    maxLength: maxLength(30)
                },
                confirmPassword: {
                    sameAsPassword: sameAs('password')
                }
            }
        }
    }
</script>

<style scoped>
.register-page {
    position: fixed;
    width: 100vw;
    height: 100vh;
    background: #d2d6de;
}
</style>