package Ceaser;

public class Decrypt {
    private String decrypted="";
    private String encrypted;
    private int key;

    public Decrypt(String encrypted, int key){
        this.encrypted = encrypted;
        this.key = key;
    }
    public void Decode() throws Exception {
        if(key < 1 || key > 25) throw new Exception("The key must be between 1 and 25");
        int n = encrypted.length();
}
