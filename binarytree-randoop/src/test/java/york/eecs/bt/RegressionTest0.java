package york.eecs.bt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        java.lang.Class<?> wildcardClass4 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        java.lang.Class<?> wildcardClass3 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        java.lang.Class<?> wildcardClass5 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        java.lang.Class<?> wildcardClass1 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList2 = binaryTree1.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        java.lang.Class<?> wildcardClass3 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        java.lang.Class<?> wildcardClass8 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList2 = binaryTree1.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = node1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList2 = binaryTree1.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        java.lang.Class<?> wildcardClass2 = binaryTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        java.lang.Class<?> wildcardClass5 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        java.lang.Class<?> wildcardClass8 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        java.lang.Class<?> wildcardClass8 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        java.lang.Class<?> wildcardClass12 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList13 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList15 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList3 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList2 = binaryTree1.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList15 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        york.eecs.bt.Node node2 = null;
        binaryTree1.setRoot(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree1.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass4 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass4 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList17 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList14 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass2 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        york.eecs.bt.Node node17 = null;
        binaryTree0.setRoot(node17);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList16 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        york.eecs.bt.Node node2 = null;
        binaryTree1.setRoot(node2);
        java.lang.Class<?> wildcardClass4 = binaryTree1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.setRoot(node6);
        java.lang.Class<?> wildcardClass8 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        java.lang.Class<?> wildcardClass10 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass8 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.insert(node14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList16 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        java.lang.Class<?> wildcardClass5 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.setRoot(node12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList14 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.setRoot(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        java.lang.Class<?> wildcardClass9 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        york.eecs.bt.Node node17 = null;
        binaryTree0.setRoot(node17);
        york.eecs.bt.Node node19 = null;
        binaryTree0.insert(node19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList21 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.insert(node14);
        york.eecs.bt.Node node16 = null;
        binaryTree0.insert(node16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList14 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        york.eecs.bt.Node node17 = null;
        binaryTree0.setRoot(node17);
        york.eecs.bt.Node node19 = null;
        binaryTree0.insert(node19);
        york.eecs.bt.Node node21 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList22 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.insert(node14);
        york.eecs.bt.Node node16 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        york.eecs.bt.Node node2 = null;
        binaryTree1.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree1.insert(node4);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        york.eecs.bt.Node node2 = null;
        binaryTree1.insert(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree1.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = node2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        java.lang.Class<?> wildcardClass15 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        java.lang.Class<?> wildcardClass12 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        york.eecs.bt.Node node12 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.setRoot(node15);
        york.eecs.bt.Node node17 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList18 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.setRoot(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.setRoot(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        java.lang.Class<?> wildcardClass11 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.setRoot(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList17 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.setRoot(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        java.lang.Class<?> wildcardClass10 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList5 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        york.eecs.bt.Node node17 = null;
        binaryTree0.setRoot(node17);
        york.eecs.bt.Node node19 = null;
        binaryTree0.insert(node19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList21 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        york.eecs.bt.Node node2 = null;
        binaryTree1.insert(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList4 = binaryTree1.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        java.lang.Class<?> wildcardClass8 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.insert(node14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList16 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.insert(node14);
        java.lang.Class<?> wildcardClass16 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.setRoot(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.setRoot(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        york.eecs.bt.Node node15 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        york.eecs.bt.Node node12 = null;
        binaryTree0.setRoot(node12);
        java.lang.Class<?> wildcardClass14 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        york.eecs.bt.Node node11 = null;
        binaryTree0.setRoot(node11);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.setRoot(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList15 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.setRoot(node15);
        york.eecs.bt.Node node17 = null;
        binaryTree0.setRoot(node17);
        java.lang.Class<?> wildcardClass19 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.setRoot(node14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.setRoot(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.setRoot(node15);
        java.lang.Class<?> wildcardClass17 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList8 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList10 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList12 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = null;
        binaryTree0.setRoot(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.insert(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        york.eecs.bt.Node node12 = null;
        binaryTree0.setRoot(node12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        york.eecs.bt.Node node17 = null;
        binaryTree0.setRoot(node17);
        york.eecs.bt.Node node19 = null;
        binaryTree0.setRoot(node19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = binaryTree0.getRoot();
        york.eecs.bt.Node node12 = null;
        binaryTree0.insert(node12);
        york.eecs.bt.Node node14 = binaryTree0.getRoot();
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList17 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList7 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = binaryTree0.getRoot();
        york.eecs.bt.Node node8 = null;
        binaryTree0.insert(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.setRoot(node10);
        york.eecs.bt.Node node12 = binaryTree0.getRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        york.eecs.bt.Node node0 = null;
        york.eecs.bt.BinaryTree binaryTree1 = new york.eecs.bt.BinaryTree(node0);
        york.eecs.bt.Node node2 = null;
        binaryTree1.setRoot(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree1.insert(node4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree1.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.inOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = binaryTree0.getRoot();
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.setRoot(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = binaryTree0.getRoot();
        york.eecs.bt.Node node3 = null;
        binaryTree0.setRoot(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList6 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList11 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.insert(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.setRoot(node15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList17 = binaryTree0.bfs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = binaryTree0.getRoot();
        york.eecs.bt.Node node2 = null;
        binaryTree0.insert(node2);
        york.eecs.bt.Node node4 = null;
        binaryTree0.insert(node4);
        york.eecs.bt.Node node6 = null;
        binaryTree0.insert(node6);
        york.eecs.bt.Node node8 = null;
        binaryTree0.setRoot(node8);
        york.eecs.bt.Node node10 = null;
        binaryTree0.insert(node10);
        york.eecs.bt.Node node12 = null;
        binaryTree0.setRoot(node12);
        york.eecs.bt.Node node14 = null;
        binaryTree0.setRoot(node14);
        york.eecs.bt.Node node16 = binaryTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList17 = binaryTree0.preOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = null;
        binaryTree0.setRoot(node4);
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        java.lang.Class<?> wildcardClass13 = binaryTree0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.insert(node1);
        york.eecs.bt.Node node3 = null;
        binaryTree0.insert(node3);
        york.eecs.bt.Node node5 = binaryTree0.getRoot();
        york.eecs.bt.Node node6 = binaryTree0.getRoot();
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList9 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        york.eecs.bt.BinaryTree binaryTree0 = new york.eecs.bt.BinaryTree();
        york.eecs.bt.Node node1 = null;
        binaryTree0.setRoot(node1);
        york.eecs.bt.Node node3 = binaryTree0.getRoot();
        york.eecs.bt.Node node4 = binaryTree0.getRoot();
        york.eecs.bt.Node node5 = null;
        binaryTree0.insert(node5);
        york.eecs.bt.Node node7 = null;
        binaryTree0.insert(node7);
        york.eecs.bt.Node node9 = null;
        binaryTree0.setRoot(node9);
        york.eecs.bt.Node node11 = null;
        binaryTree0.insert(node11);
        york.eecs.bt.Node node13 = null;
        binaryTree0.setRoot(node13);
        york.eecs.bt.Node node15 = null;
        binaryTree0.insert(node15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<york.eecs.bt.Node> nodeList17 = binaryTree0.postOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(node4);
    }
}

