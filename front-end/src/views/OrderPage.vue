<template>
    <div class="content-wrapper">
        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-sm-12">
                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">TẠO ĐƠN HÀNG</h3>
                        </div>
                        <form class="form-horizontal">
                            <div class="box-body">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group has-error">
                                            <label class="col-sm-4 control-label" for="branch">Chi nhánh</label>
                                            <div class="col-sm-8">
                                                <select name="branch_id" id="branch" class="form-control">
                                                    <option value="1">Chi nhánh 1</option>
                                                    <option value="2">Chi nhánh 2</option>
                                                    <option value="3">Chi nhánh 3</option>
                                                    <option value="4">Chi nhánh 4</option>
                                                </select>
                                                <span class="help-block">Lỗi xảy ra ở đây</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group has-error">
                                            <label class="col-sm-4 control-label" for="customer_name">Tên khách hàng</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control" id="customer_name" value="Khách hàng A">
                                                <span class="help-block">Lỗi xảy ra ở đây</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group has-error">
                                            <label class="col-sm-4 control-label" for="employee">Nhân viên</label>
                                            <div class="col-sm-8">
                                                <input type="text" class="form-control" id="employee" disabled value="Nhân viên A">
                                                <span class="help-block">Lỗi xảy ra ở đây</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group has-error">
                                            <label class="col-sm-4 control-label" for="table">Số bàn</label>
                                            <div class="col-sm-8">
                                                <select name="table_id" id="table" class="form-control">
                                                    <option value="1">Bàn 1</option>
                                                    <option value="2">Bàn 2</option>
                                                    <option value="3">Bàn 3</option>
                                                    <option value="4">Bàn 4</option>
                                                </select>
                                                <span class="help-block">Lỗi xảy ra ở đây</span>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->
    </div>
</template>

<script>
    export default {
        name: "OrderPage",
    }
</script>

<style scoped>

</style>