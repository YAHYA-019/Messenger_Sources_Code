package X;

import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;

/* renamed from: X.1nO, reason: invalid class name */
/* loaded from: 1nO.class */
public abstract class C1nO {
    public static final Executor A00 = new Executor() { // from class: X.1nP
        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            Execution.executePossiblySync(new C1iw() { // from class: X.1nR
                public static final String __redex_internal_original_name = "Utils$Companion$networkContextExecutor$1$1";

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("MqttXplatNativeClient");
                }

                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, null, 3);
        }
    };
}
