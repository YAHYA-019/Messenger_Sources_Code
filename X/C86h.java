package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.86h, reason: invalid class name */
/* loaded from: 86h.class */
public final class C86h implements TextWatcher {
    public long A00;
    public final ThreadKey A01;
    public final 22C A02;
    public final long A03;
    public final C00i A04;
    public final Runnable A05;
    public final ScheduledExecutorService A06;
    public final boolean A07;

    public C86h(C00i c00i, ThreadKey threadKey, 22C r304, ScheduledExecutorService scheduledExecutorService, long j, boolean z) {
        11T.A0F(scheduledExecutorService, 5);
        this.A01 = threadKey;
        this.A02 = r304;
        this.A04 = c00i;
        this.A00 = 0L;
        this.A06 = scheduledExecutorService;
        this.A07 = z;
        this.A03 = j;
        this.A05 = new Runnable() { // from class: X.86i
            public static final String __redex_internal_original_name = "ChatStateTypingTextWatcher$typingIndicatorStartRunnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                C86h c86h = C86h.this;
                c86h.A02.A06(c86h.A01.A01);
            }
        };
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() <= 0) {
            return;
        }
        if (!this.A07) {
            this.A02.A06(this.A01.A01);
            return;
        }
        long now = ((C0dr) this.A04.get()).now();
        if (now - this.A00 > this.A03) {
            this.A00 = now;
            this.A06.schedule(this.A05, 0L, TimeUnit.MILLISECONDS);
        }
    }
}
