package Cat;

public class Cat1 {
    public static void main(String[] args) {
        int number = 3; // ���������� � ������� �����
        int result = 1; // ��������� ���������� � �������
        int power = 1; // ��������� ���������� �������
        while(true) {
            result = result * number;
            System.out.println(number + " � ������� " + power + " = " + result);
            power++;
            if (power>10)
                break; // ����� �� �����
        }
    }
}
