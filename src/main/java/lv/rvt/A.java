package lv.rvt;

class A {
    public void a() {
        System.out.println("A");
    }
}

class B extends A {
    public void b() {
        System.out.println("B");
    }
}

class C extends B {
    public void c() {
        System.out.println("C");
    }
}