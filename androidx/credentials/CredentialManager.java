package androidx.credentials;

import X.0DR;
import X.KRC;
import X.Kgc;
import X.Kjv;
import X.KoU;
import X.KxB;
import X.MI4;
import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: CredentialManager.class */
public interface CredentialManager {
    public static final KxB Companion = KxB.A00;

    Object clearCredentialState(KRC krc, 0DR r2);

    void clearCredentialStateAsync(KRC krc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    Object createCredential(Context context, Kjv kjv, 0DR r3);

    void createCredentialAsync(Context context, Kjv kjv, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    PendingIntent createSettingsPendingIntent();

    Object getCredential(Context context, Kgc kgc, 0DR r3);

    Object getCredential(Context context, KoU koU, 0DR r3);

    void getCredentialAsync(Context context, Kgc kgc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    void getCredentialAsync(Context context, KoU koU, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);

    Object prepareGetCredential(Kgc kgc, 0DR r2);

    void prepareGetCredentialAsync(Kgc kgc, CancellationSignal cancellationSignal, Executor executor, MI4 mi4);
}
