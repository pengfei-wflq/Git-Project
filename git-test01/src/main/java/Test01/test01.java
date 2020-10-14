package Test01;

/**
 * 动力节点张鹏飞
 * 2020/10/14
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
        System.out.println("ddd");

        System.out.println("员工1更改了代码，并且push到远程仓库");

        //这样的话就会出现冲突
        System.out.println("员工2更改了代码，没有push到远程仓库，但是要从远程仓库更新代码");

        //如果先将员工2的代码commit到本地仓库，在pull的话，如果有冲突，就可以对两个员工的代码进行选择
    }
}
