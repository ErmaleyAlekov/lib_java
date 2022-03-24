package libft;
public class test {
    public static void main(String[] args)
    {
        char str[] = {'a',0,'c'};
        int res = ft.strlen(str);
        String f = "-56.7";
        System.out.printf("length: %d\n", res);
        int a = ft.atoi(f);
        System.out.printf("atoi: %d\n", a);
        String m = ft.memccpy(f, 'S', -55);
        System.out.printf("m: %s\n", m);
        String m2 = f + " " + m;
        System.out.printf("m2: %s\n", m2);
        // String dfg = "sdfsdf";
        String g = ft.bzero(m2, 1);
        System.out.printf("g: %s\n", g);
        String d = ft.split(m2, ' ');
        ft.putendl(d);
        int e = ft.memcmp(m + "f", m2, 5);
        System.out.printf("memcmp: %d\n", e);

    }
}
