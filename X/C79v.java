package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.79v, reason: invalid class name */
/* loaded from: 79v.class */
public final class C79v implements TextWatcher {
    public long A00;
    public final C00i A01;
    public final ThreadKey A02;
    public final 5P8 A03;
    public final long A04;
    public final C00i A05;
    public final C6xN A06;
    public final Runnable A07;
    public final ScheduledExecutorService A08;
    public final boolean A09;

    public C79v(C00i c00i, C00i c00i2, ThreadKey threadKey, 5P8 r305, C6xN c6xN, ScheduledExecutorService scheduledExecutorService, long j, boolean z) {
        11T.A0F(scheduledExecutorService, 6);
        this.A02 = threadKey;
        this.A03 = r305;
        this.A01 = c00i;
        this.A05 = c00i2;
        this.A00 = 0L;
        this.A08 = scheduledExecutorService;
        this.A09 = z;
        this.A04 = j;
        this.A06 = c6xN;
        this.A07 = new Runnable() { // from class: X.79w
            public static final String __redex_internal_original_name = "SdkChatStateTypingTextWatcher$typingIndicatorStartRunnable$1";

            @Override // java.lang.Runnable
            public final void run() {
                C79v c79v = C79v.this;
                5P8 r0 = c79v.A03;
                c79v.A01.get();
                r0.A0X(5QA.A00(c79v.A02), true);
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
        if (charSequence == null || charSequence.length() <= 0 || 11T.A0O(this.A06.A00, true)) {
            return;
        }
        if (!this.A09) {
            5P8 r0 = this.A03;
            this.A01.get();
            r0.A0X(5QA.A00(this.A02), true);
        } else {
            long now = ((C0dr) this.A05.get()).now();
            if (now - this.A00 > this.A04) {
                this.A00 = now;
                this.A08.schedule(this.A07, 0L, TimeUnit.MILLISECONDS);
            }
        }
    }
}
