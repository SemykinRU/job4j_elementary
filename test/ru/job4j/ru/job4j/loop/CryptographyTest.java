package ru.job4j.ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CryptographyTest {

    @Test
    public void codeLengthGreat4() {
        String code = Cryptography.code("4556364607935616");
        Assert.assertEquals(code, "############5616");
    }

    @Test
    public void codeLengthLess4() {
        String code = Cryptography.code("123");
        Assert.assertEquals(code, "123");
    }

    @Test
    public void codeEmptyString() {
        String code = Cryptography.code("");
        Assert.assertEquals(code, "empty");
    }
}