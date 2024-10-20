package X;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: Khl.class */
public final class Khl {
    public ExecutorService A00;
    public final File A01;

    public Khl(1Mi r302, ExecutorService executorService) {
        1BL.A1F(r302, executorService);
        File file = null;
        try {
            file = r302.AUU(384226697);
        } catch (Exception e) {
            0fH.A0q(4YT.A00(669), 4YT.A00(613), e);
        }
        this.A00 = executorService;
        this.A01 = file;
    }
}
