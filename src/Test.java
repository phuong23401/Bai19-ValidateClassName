public class Test {
    public static ClassNameExample className;
    public static final String[] validName = new String[]{"C0318M", "C1220G", "A2345H", "P7382I", "P4323K", "A3334L"};
    public static final String[] invalidName = new String[]{"M7383G", "P6373A", "1233"};

    public static void main(String[] args) {
        className = new ClassNameExample();
        for (String name : validName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class name " + name + " is valid: " + isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = className.validate(name);
            System.out.println("Class name " + name + " is valid: " + isvalid);
        }
    }
}
