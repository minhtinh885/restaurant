<template>
    <div class="hold-transition skin-blue fixed sidebar-mini">
        <div class="wrapper">
            <PageHeader/>
            <PageMainSidebar/>

            <!-- Content Wrapper. Contains page content -->
            <router-view></router-view>
            <PageFooter/>
            <PageRightSidebar/>
            <div class="control-sidebar-bg"></div>
        </div>
    </div>

</template>

<script>
    import PageRightSidebar from "./PageRightSidebar";
    import PageMainSidebar from "./PageMainSidebar";
    import PageHeader from "./PageHeader";
    import PageFooter from "./PageFooter";

    export default {
        name: "LayoutPage",
        components: {
            PageRightSidebar,
            PageMainSidebar,
            PageHeader,
            PageFooter
        }
    }
</script>

<style scoped>

</style>