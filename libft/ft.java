/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft.java                                            :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: uterese <uterese@student.21-school.ru>     +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/03/24 21:47:58 by uterese           #+#    #+#             */
/*   Updated: 2022/03/25 01:47:23 by uterese          ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package libft;
import java.util.Arrays;
public class ft
{
    public static int arrlen(int arr[])
    {
        int i = 0;
        try
        {
            int buff;
            while (true)
            buff = arr[i++];
        }
        catch(Exception e)
        {
            return i - 1;
        }
    }
    public static int arrlen(double arr[])
    {
        int i = 0;
        try
        {
            double buff;
            while (true)
            buff = arr[i++];
        }
        catch(Exception e)
        {
            return i - 1;
        }
    }
    public static int arrlen(float arr[])
    {
        int i = 0;
        try
        {
            float buff;
            while (true)
            buff = arr[i++];
        }
        catch(Exception e)
        {
            return i - 1;
        }
    }
    public static int strlen(char str[])
    {
        int i = 0;
        try
        {
            char buff;
            while (true)
            buff = str[i++];
        }
        catch(Exception e)
        {
            return i - 1;
        }
    }
    public static int strlen(String str)
    {
        char str2[] = str.toCharArray();
        int res = strlen(str2);
        return res;
    }
    public static int atoi(String str)
    {
        int znak = 1;
        int result = 0;
        char str2[] = str.toCharArray();
        for (int i = 0; i < strlen(str2); i++)
        {
            if (str2[i] == '-' && result == 0)
                znak = -1;
            if ((str2[i] >= '0' && str2[i] <= '9'))
                result = ((result * 10) + (str2[i] - '0'));
            if (result > 0 && (str2[i] < '0' || str2[i] > '9'))
                return result * znak;
        }
        return result * znak;
    }
    public static String memset(String str, char c, int n)
    {
        if (n > strlen(str) || n <= 0)
            return str;
        char buff[] = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<strlen(str);i++)
        {
            if (i == n)
                res.append(c);
            else
                res.append(buff[i]);
        }
        return res.toString();
    }
    public static String bzero(String str, int n)
    {
        if (n <= 0)
            return str;
        char buff[] = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<strlen(str);i++)
        {
            if (i < n)
                res.append('0');
            else
                res.append(buff[i]);
        }
        return res.toString();
    }
    public static int isalpha(char c)
    {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return 1;
        return 0;
    }
    public static int isascii(char c)
    {
        if (c >= 0 && c <= 127)
            return 1;
        return 0;
    }
    public static int isdigit(char c)
    {
        if (c >= '0' && c <= '9')
            return 1;
        return 0;
    }
    public static int	isalnum(char c)
    {
        int	a;
        int	b;
        a = isalpha(c);
        b = isdigit(c);
        if (a == 1 || b == 1)
            return 1;
        return 0;
    }
    public static int	isprint(char c)
    {
        if (c >= 32 && c <= 126)
            return 1;
        return 0;
    }
    public static String itoa(int n)
    {
        String res = n + "";
        return res;
    }
    public static int[] appendInt(int array[], int element) 
    {
        int result[] = Arrays.copyOf(array, arrlen(array) + 1);
        result[arrlen(result) - 1] = element;
        return result;
    }
    public static int[] appendInt(int array[], int element, int count) 
    {
        int result[] = Arrays.copyOf(array, arrlen(array) + count);
        int i = arrlen(array);
        while (arrlen(array) < arrlen(result))
            result[i++] = element;
        return result;
    }
    public static double[] appendDouble(double array[], double element, int count) 
    {
        double result[] = Arrays.copyOf(array, arrlen(array) + count);
        int i = arrlen(array);
        while (arrlen(array) < arrlen(result))
            result[i++] = element;
        return result;
    }
    public static double[] appendDouble(double array[], double element) 
    {
        double result[] = Arrays.copyOf(array, arrlen(array) + 1);
        result[arrlen(result) - 1] = element;
        return result;
    }
    public static float[] appendFloat(float array[], float element, int count) 
    {
        float result[] = Arrays.copyOf(array, arrlen(array) + count);
        int i = arrlen(array);
        while (arrlen(array) < arrlen(result))
            result[i++] = element;
        return result;
    }
    public static float[] appendFloat(float array[], float element) 
    {
        float result[] = Arrays.copyOf(array, arrlen(array) + 1);
        result[arrlen(result) - 1] = element;
        return result;
    }
    public static char[] appendChar(char array[], char element, int count) 
    {
        char result[] = Arrays.copyOf(array, strlen(array) + count);
        int i = strlen(array);
        while (strlen(array) < strlen(result))
            result[i++] = element;
        return result;
    }
    public static char[] appendChar(char array[], char element) 
    {
        char result[] = Arrays.copyOf(array, strlen(array) + 1);
        result[strlen(result) - 1] = element;
        return result;
    }
    public static String memccpy(String str, char c, int n)
    {
        if (n > strlen(str) || n <= 0)
            n = strlen(str);
        char buff[] = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<n;i++)
        {
            
            if (buff[i] != c)
                res.append(buff[i]);
            else
                return res.toString();
        }
        return res.toString();
    }
    public static int memchr(String str, char c, int n)
    {
        if (n > strlen(str) || n <= 0)
            n = strlen(str);
        char buff[] = str.toCharArray();
        for (int i = 0;i<n;i++)
            if (buff[i] == c)
                return i;
        return 0;
    }
    public static int memcmp(String s1, String s2, int n)
    {
        if (n <= 0 || n > strlen(s1)||n>strlen(s2))
        {
            System.out.print("memcmp: Wrong N value! Return 0\n");
            return 0;
        }
        char buff[] = s1.toCharArray();
        char buff2[] = s2.toCharArray();
        int i = 0;
        while (buff[i] == buff2[i] && i < n - 1)
            i++;
        return (char)buff[i] - (char)buff2[i];
    }
    public static String memcpy(String str, int n)
    {
        if (n <= 0 || n > strlen(str))
            return str;
        char buff[] = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<n;i++)
            res.append(buff[i]);
        return res.toString();
    }
    public static String memset(String str, String c, int index)
    {
        if (index > strlen(str) || index <= 0)
            return str;
        char buff[] = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<strlen(str);i++)
        {
            if (i == index)
                res.append(c);
            res.append(buff[i]);
        }
        return res.toString();
    }
    public static void putendl(String str)
    {
        System.out.printf("%s\n",str);
    }
    public static String split(String str, char c)
    {
        char buff[] = str.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<strlen(str);i++)
        {
            if (buff[i] == c)
                return res.toString();
            res.append(buff[i]);
        }
        return res.toString();
    }
}