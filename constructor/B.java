class B extends A { //  Error: A() is not visible
    public B() {
        super();  // Cannot call private constructor
    }
}