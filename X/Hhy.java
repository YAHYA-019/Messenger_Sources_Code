package X;

/* loaded from: Hhy.class */
public final class Hhy {
    public final J6P A00;
    public final HpE A01;
    public final Hn4 A02;
    public final I8P A03;
    public final J6I A04;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.JJU, X.J6I, java.lang.Object] */
    public Hhy() {
        I8P i8p = new I8P();
        Hn4 hn4 = new Hn4();
        this.A02 = hn4;
        this.A01 = new HpE();
        ?? obj = new Object();
        this.A04 = obj;
        this.A00 = new J6P("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", (JJU) obj);
        this.A03 = i8p;
        hn4.A00 = null;
    }
}
