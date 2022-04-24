package Ceaser;


public class Encrypt {

    private String encrypted = "";
    public String encoding(String plainText, int key) throws Exception {
        int n = plainText.length();

        if (key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");

