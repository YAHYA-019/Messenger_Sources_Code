package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: Ihe.class */
public final class Ihe implements JJ6 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ IDb A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Function1 A04;
    public final /* synthetic */ boolean A05;

    public Ihe(Context context, IDb iDb, File file, String str, Function1 function1, boolean z) {
        this.A02 = file;
        this.A01 = iDb;
        this.A00 = context;
        this.A03 = str;
        this.A05 = z;
        this.A04 = function1;
    }

    @Override // X.JJ6
    public void CIc(Uri uri) {
        if (!this.A05) {
            ((9aT) 1Br.A0B(this.A01.A03)).A00(this.A00, 2131967902);
        }
        this.A04.invoke(4YW.A0A("reason for failure", AnonymousClass001.A0Z(uri, "Unable to save file for uri: ", AnonymousClass001.A0k()), 1BK.A1G("save result", "false")));
    }

    @Override // X.JJ6
    public void CId(Uri uri) {
        HnA hnA = new HnA(this.A02, true);
        IDb iDb = this.A01;
        IDb.A00(this.A00, uri, hnA, iDb, this.A03, this.A04, this.A05, true);
    }
}
