package group.pdp.utils;

import group.pdp.controller.*;
import group.pdp.service.*;

import java.util.Scanner;

public class ObjectUtil {

    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanStr = new Scanner(System.in);
    public static AdminController adminController = new AdminController();
    public static CategoryController categoryController = new CategoryController();
    public static OrderController orderController = new OrderController();
    public static ProductController productController = new ProductController();
    public static UserController userController = new UserController();

    public static AdminService adminService = new AdminService();
    public static CategoryService categoryService = new CategoryService();
    public static Customerservice customerservice = new Customerservice();
    public static OrderService orderService = new OrderService();
    public static ProductService productService = new ProductService();
    public static UserService userService = new UserService();
}
