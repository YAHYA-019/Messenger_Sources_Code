package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: Cbc.class */
public final class Cbc implements CallerContextable {
    public static final String __redex_internal_original_name = "TopThreadsLoader";
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A05;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0E;
    public final long A0H;
    public static final 2To A0K = 2To.A0G;
    public static final BOR A0J = BOR.A03;
    public static final BOi A0I = BOi.A02;
    public final 1Br A0D = AbG.A0T();
    public final 1Br A06 = 1Bq.A00(116386);
    public final 1Br A04 = 1Bq.A00(83165);
    public final 1Br A03 = AbG.A0J();
    public SettableFuture A00 = 4YU.A0j();
    public final boolean A0G = AbL.A0P(this.A0D).AZk(36316671497152933L);
    public final boolean A0F = AbL.A0P(this.A0D).AZk(36316671497284007L);

    public Cbc(Context context, FbUserSession fbUserSession) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A07 = 1Bu.A01(context, 83542);
        this.A08 = 1Bu.A01(context, 33205);
        this.A0E = 1Bu.A01(context, 84074);
        this.A0B = 1Bu.A01(context, 83549);
        this.A09 = 1Bu.A01(context, 84206);
        this.A0C = 1Bu.A01(context, 84073);
        this.A0A = 1Bu.A01(context, 84129);
        this.A05 = 1Bu.A01(context, 84136);
        this.A0H = ((CIl) 1Br.A0B(this.A0A)).A00();
    }

    public static final 2To A00(Cbc cbc, String str) {
        return (str != null && str.equals(BMK.A06.toString()) && ((C1n) 1Br.A0B(cbc.A05)).A00()) ? 2To.A05 : A0K;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:1|(1:3)|4|(1:6)(1:333)|7|(9:9|10|11|12|(4:14|15|16|17)(2:328|329)|18|(4:20|21|22|23)|24|(54:26|27|(2:29|30)(1:326)|31|32|33|(3:35|36|(3:38|(11:42|43|44|45|46|47|48|(11:50|51|52|53|54|55|56|(9:99|100|101|102|103|104|105|106|107)(3:58|59|(6:93|94|95|96|97|98)(2:61|(5:80|81|82|83|84)))|85|86|87)(1:108)|88|40|39)|109))|110|111|112|113|114|115|116|(16:118|119|120|(12:124|125|126|127|(1:129)(1:148)|130|131|132|(1:147)(4:134|135|136|(4:143|144|145|146)(4:138|139|140|141))|142|122|121)|149|150|151|152|153|154|155|156|157|(8:160|(4:162|163|164|165)|166|167|(4:169|170|171|172)|173|174|158)|175|176)|177|178|179|180|181|182|183|184|185|186|187|(7:189|190|191|192|193|194|195)|196|197|198|199|200|201|202|203|204|205|206|207|208|209|210|211|212|213|214|(1:216)(1:301)|217|(8:246|247|248|249|250|(6:252|(1:254)|255|(8:258|(1:290)|264|(2:288|289)(2:266|(2:286|287)(3:268|(1:278)|281))|279|280|281|256)|291|292)|293|(1:295))|221|222|(5:238|239|240|(1:242)(1:244)|243)(5:226|227|228|(1:230)(1:237)|231)|232|233))(1:332)|327|214|(0)(0)|217|(1:219)|246|247|248|249|250|(0)|293|(0)|221|222|(1:224)|238|239|240|(0)(0)|243|232|233|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:236:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x07c4, code lost:
    
        r316 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x07c6, code lost:
    
        X.0fH.A0w(X.Cbc.__redex_internal_original_name, "TopThreadsLoader getScoreSortResult() failed", r316);
        r301.A00.setException(r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07e5, code lost:
    
        if (r0 != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x07e8, code lost:
    
        r0 = X.AbN.A0P(r301);
        r0 = X.Cbc.A0J;
        r0 = r316.getMessage();
        X.1Br.A0C(((X.CIl) r0.get()).A03);
        r0.A01(r324, r0, r0, 1, 0, X.C7t3.A00());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x061a  */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v226, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v288, types: [java.lang.Throwable, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.google.common.util.concurrent.ListenableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.SettableFuture A01(X.BzA r302, java.lang.String r303, java.util.Set r304, int r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 2937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbc.A01(X.BzA, java.lang.String, java.util.Set, int, boolean):com.google.common.util.concurrent.SettableFuture");
    }
}
