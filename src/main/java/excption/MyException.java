package excption;

public class MyException extends Exception{
    private String msg;

    public MyException(String msg){
        super(msg);//优先给父类初始化
        this.msg=msg;
    }
}
