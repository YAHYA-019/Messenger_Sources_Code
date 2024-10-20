package X;

/* loaded from: Hpf.class */
public final class Hpf {
    public final I8Q A00;
    public final HsQ A01;
    public final RHS A02;
    public final I8k A03;
    public final Il4 A04;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.Il4, X.JJO, java.lang.Object] */
    public Hpf() {
        I8k i8k = new I8k();
        RHS rhs = new RHS();
        this.A02 = rhs;
        this.A01 = new HsQ();
        ?? obj = new Object();
        this.A04 = obj;
        this.A00 = new I8Q((JJO) obj, "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n");
        this.A03 = i8k;
        rhs.A00 = null;
    }

    public void A00() {
        RHS rhs = this.A02;
        Thread thread = rhs.A00;
        if (thread == null) {
            thread = Thread.currentThread();
            rhs.A00 = thread;
        }
        if (Thread.currentThread() != thread) {
            throw AnonymousClass001.A0N("Wrong thread");
        }
        this.A00.A01();
        this.A01.A00();
        this.A03.A01();
        rhs.A00 = null;
    }
}
