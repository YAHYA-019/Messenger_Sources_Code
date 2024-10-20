package X;

import com.meta.vm.OpusRecorder;

/* loaded from: Ili.class */
public final class Ili implements JM5 {
    public OpusRecorder A00;

    @Override // X.JM5
    public int Ave() {
        return 0;
    }

    @Override // X.JM5
    public long B1B() {
        return this.A00.getPageNumber();
    }

    @Override // X.JM5
    public void release() {
        this.A00.close();
    }

    @Override // X.JM5
    public void start() {
        this.A00.start();
    }

    @Override // X.JM5
    public void stop() {
        this.A00.stop();
    }
}
