package com.domeastudio.mappingo.servers.microservice.postgresql.utils;

//        java.version	Java 运行时环境版本
//        java.vendor	Java 运行时环境供应商
//        java.vendor.url	Java 供应商的 URL
//        java.home	Java 安装目录
//        java.vm.specification.version	Java 虚拟机规范版本
//        java.vm.specification.vendor	Java 虚拟机规范供应商
//        java.vm.specification.name	Java 虚拟机规范名称
//        java.vm.version	Java 虚拟机实现版本
//        java.vm.vendor	Java 虚拟机实现供应商
//        java.vm.name	Java 虚拟机实现名称
//        java.specification.version	Java 运行时环境规范版本
//        java.specification.vendor	Java 运行时环境规范供应商
//        java.specification.name	Java 运行时环境规范名称
//        java.class.version	Java 类格式版本号
//        java.class.path	Java 类路径
//        java.library.path	加载库时搜索的路径列表
//        java.io.tmpdir	默认的临时文件路径
//        java.compiler	要使用的 JIT 编译器的名称
//        java.ext.dirs	一个或多个扩展目录的路径
//        os.name	操作系统的名称
//        os.arch	操作系统的架构
//        os.version	操作系统的版本
//        file.separator	文件分隔符（在 UNIX 系统中是“/”）
//        path.separator	路径分隔符（在 UNIX 系统中是“:”）
//        line.separator	行分隔符（在 UNIX 系统中是“/n”）
//        user.name	用户的账户名称
//        user.home	用户的主目录
//        user.dir	用户的当前工作目录

public class OSInfo {
    public static String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public static String getJavaVendor() {
        return System.getProperty("java.vendor");
    }

    public static String getJavaVendorUrl() {
        return System.getProperty("java.vendor.url");
    }

    public static String getJavaHome() {
        return System.getProperty("java.home");
    }

    public static String getJavaVmSpecificationVersion() {
        return System.getProperty("java.vm.specification.version");
    }

    public static String getJavaVmSpecificationVendor() {
        return System.getProperty("java.vm.specification.vendor");
    }

    public static String getJavaVmSpecificationName() {
        return System.getProperty("java.vm.specification.name");
    }

    public static String getJavaVmVersion() {
        return System.getProperty("java.vm.version");
    }

    public static String getJavaVmVendor() {
        return System.getProperty("java.vm.vendor");
    }

    public static String getJavaVmName() {
        return System.getProperty("java.vm.name");
    }

    public static String getJavaSpecificationVersion() {
        return System.getProperty("java.specification.version");
    }

    public static String getJavaSpecificationVendor() {
        return System.getProperty("java.specification.vendor");
    }

    public static String getJavaSpecificationName() {
        return System.getProperty("java.specification.name");
    }

    public static String getJavaClassVersion() {
        return System.getProperty("java.class.version");
    }

    public static String getJavaClassPath() {
        return System.getProperty("java.class.path");
    }

    public static String getJavaLibraryPath() {
        return System.getProperty("java.library.path");
    }

    public static String getJavaIoTmpdir() {
        return System.getProperty("java.io.tmpdir");
    }

    public static String getJavaCompiler() {
        return System.getProperty("java.compiler");
    }

    public static String getJavaExtDirs() {
        return System.getProperty("java.ext.dirs");
    }

    public static String getOsName() {
        return System.getProperty("os.name");
    }

    public static String getOsArch() {
        return System.getProperty("os.arch");
    }

    public static String getOsVersion() {
        return System.getProperty("os.version");
    }

    public static String getFileSeparator() {
        return System.getProperty("file.separator");
    }

    public static String getPathSeparator() {
        return System.getProperty("path.separator");
    }

    public static String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    public static String getUserName() {
        return System.getProperty("user.name");
    }

    public static String getUserHome() {
        return System.getProperty("user.home");
    }

    public static String getUserDir() {
        return System.getProperty("user.dir");
    }

    public static String getClassPath(Class claz, String findName) {
        return claz.getClassLoader().getResource(findName).getPath();
    }

    public static String getClassPath(String findName) {
        return OSInfo.class.getClassLoader().getResource(findName).getPath();
    }

    public static Boolean isLinux() {
        return getOsName().toLowerCase().contains("linux");
    }

    public static Boolean isWindows() {
        return getOsName().toLowerCase().contains("windows");
    }

    public static Boolean isUnix() {
        return getOsName().toLowerCase().contains("unix");
    }
}
