public class Sample01 {
    public static void main(String[] args) {

        String phone = "+1-678-675-(98765)";

        String replace = phone.replace("+", "")
                .replace("-", "")
                .replace("(", "")
                .replace(")","");

        System.out.println(replace);

        String pattern = "[^A-Za-z0-9]"; // tudo que nao for que nao estiver dentro dos tres conjuntos A-Z,a-z,0-9

        String replaceWithRegex = phone.replaceAll(pattern, "");
        System.out.println(replaceWithRegex);
    }
}
