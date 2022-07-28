package com.bridgeLabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyBinaryTreeTest {

        @Test
        public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
                MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
                myBinaryTree.add(56);
                myBinaryTree.add(30);
                myBinaryTree.add(70);
                System.out.println(myBinaryTree);
                int size = myBinaryTree.getSize();
                Assert.assertEquals(3, size);

        }

}
