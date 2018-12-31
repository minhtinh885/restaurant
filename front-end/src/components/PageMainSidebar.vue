<template>
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>Tai Phan</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Tìm kiếm...">
                    <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu" data-widget="tree">
                <li class="header">NHÂN VIÊN</li>
                <li>
                    <router-link to="user">
                        <i class="fa fa-th"></i> <span>Tạo nhân viên</span>
                    </router-link>
                </li>
                <li>
                    <router-link to="users">
                        <i class="fa fa-th"></i> <span>Danh sách nhân viên</span>
                        <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
                    </router-link>
                </li>

                <li class="header">MÓN ĂN</li>
                <li>
                    <router-link to="item">
                        <i class="fa fa-th"></i> <span>Tạo món ăn</span>
                    </router-link>
                </li>
                <li>
                    <router-link to="items">
                        <i class="fa fa-th"></i> <span>Danh sách món ăn</span>
                        <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
                    </router-link>
                </li>

                <li class="header">ĐƠN HÀNG</li>
                <li>
                    <router-link to="order">
                        <i class="fa fa-th"></i> <span>Tạo đơn hàng</span>
                    </router-link>
                </li>
                <li>
                    <router-link to="orders">
                        <i class="fa fa-th"></i> <span>Danh sách đơn hàng</span>
                        <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
                    </router-link>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
</template>

<script>
    export default {
        name: "PageMainSidebar"
    }
</script>

<style scoped>

</style>