package X;

import java.util.concurrent.ExecutorService;

/* loaded from: Ho9.class */
public final class Ho9 {
    public final JGu A00;
    public final ExecutorService A01;

    public Ho9(JGu jGu, ExecutorService executorService) {
        this.A01 = executorService;
        this.A00 = jGu;
    }

    public IjA A00(JKZ jkz) {
        IjA ijA = new IjA(jkz);
        this.A01.execute(new J1c(jkz, ijA, this));
        return ijA;
    }
}
