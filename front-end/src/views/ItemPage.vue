<template>
    <div class="content-wrapper">
        <!-- Main content -->
        <section class="content">
            <!-- input states -->
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="box box-primary">
                            <div class="box-header with-border">
                                <h3 class="box-title">TẠO MÓN ĂN</h3>
                            </div>
                            <form>
                                <div class="box-body">
                                    <div class="form-group has-success">
                                        <label class="control-label" for="inputSuccess"><i class="fa fa-check"></i> Input with success</label>
                                        <input type="text" class="form-control" id="inputSuccess" placeholder="Enter ...">
                                        <span class="help-block">Help block with success</span>
                                    </div>
                                    <div class="form-group has-warning">
                                        <label class="control-label" for="inputWarning"><i class="fa fa-bell-o"></i> Input with
                                            warning</label>
                                        <input type="text" class="form-control" id="inputWarning" placeholder="Enter ...">
                                        <span class="help-block">Help block with warning</span>
                                    </div>
                                    <div class="form-group has-error">
                                        <label class="control-label" for="inputError"><i class="fa fa-times-circle-o"></i> Input with
                                            error</label>
                                        <input type="text" class="form-control" id="inputError" placeholder="Enter ...">
                                        <span class="help-block">Help block with error</span>
                                    </div>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
</template>

<script>
    export default {
        name: "ItemPage",
    }
</script>

<style scoped>

</style>