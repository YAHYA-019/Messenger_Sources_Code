package X;

import android.os.Looper;
import com.facebook.rsys.execution.gen.Task;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* loaded from: GxF.class */
public final class GxF extends TaskExecutor {
    public final /* synthetic */ IZz A00;

    public GxF(IZz iZz) {
        this.A00 = iZz;
    }

    @Override // com.facebook.rsys.execution.gen.TaskExecutor
    public void execute(Task task, long j) {
        11T.A0F(task, 0);
        IZz iZz = this.A00;
        IZz iZz2 = IZz.$redex_init_class;
        iZz.A03.postDelayed(new IsF(task), j);
    }

    @Override // com.facebook.rsys.execution.gen.TaskExecutor
    public boolean isCurrent() {
        Looper myLooper = Looper.myLooper();
        IZz iZz = this.A00;
        IZz iZz2 = IZz.$redex_init_class;
        return 11T.A0O(myLooper, iZz.A03.getLooper());
    }
}
