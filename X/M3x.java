package X;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: M3x.class */
public final class M3x extends C00q implements Function1 {
    public final /* synthetic */ C2820Jac $alreadyComposed;
    public final /* synthetic */ C2820Jac $modifiedValues;
    public final /* synthetic */ Set $modifiedValuesSet;
    public final /* synthetic */ List $toApply;
    public final /* synthetic */ C2820Jac $toComplete;
    public final /* synthetic */ List $toInsert;
    public final /* synthetic */ C2820Jac $toLateApply;
    public final /* synthetic */ List $toRecompose;
    public final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3x(C2820Jac c2820Jac, C2820Jac c2820Jac2, C2820Jac c2820Jac3, C2820Jac c2820Jac4, Recomposer recomposer, List list, List list2, List list3, Set set) {
        super(1);
        this.this$0 = recomposer;
        this.$modifiedValues = c2820Jac;
        this.$alreadyComposed = c2820Jac2;
        this.$toRecompose = list;
        this.$toInsert = list2;
        this.$toLateApply = c2820Jac3;
        this.$toApply = list3;
        this.$toComplete = c2820Jac4;
        this.$modifiedValuesSet = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01dd, code lost:
    
        if (X.1BK.A1Y(r0) == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f3, code lost:
    
        r0.A00++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0a5b, code lost:
    
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0a64, code lost:
    
        r363 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0a6e, code lost:
    
        if (r363 >= r0) goto L817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0a89, code lost:
    
        X.C2820Jac.A04(r0, (X.MMw) r0.get(r363));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0a90, code lost:
    
        r363 = r363 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0a97, code lost:
    
        r0 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0aa0, code lost:
    
        r363 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0aaa, code lost:
    
        if (r363 >= r0) goto L818;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0ac3, code lost:
    
        ((X.MMw) r0.get(r363)).A8k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0acc, code lost:
    
        r363 = r363 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0b1f, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0ad3, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0ad8, code lost:
    
        androidx.compose.runtime.Recomposer.A03(null, r0, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0b0b, code lost:
    
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A01(r0, r0, r0, r0, r0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0b12, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0b1a, code lost:
    
        r306 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0f11, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0b28, code lost:
    
        r0 = X.AnonymousClass001.A1N(r0.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0b2e, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0b48, code lost:
    
        if (r0 == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0b4d, code lost:
    
        r0.A08(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0b54, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0b59, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0b65, code lost:
    
        r0 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0b6e, code lost:
    
        if (r0 < 0) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0b71, code lost:
    
        r322 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0b79, code lost:
    
        r326 = r0[r322];
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b91, code lost:
    
        if ((X.JQz.A0I(r326, 7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0b94, code lost:
    
        r0 = X.JR0.A0G(r322, r0);
        r324 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0ba7, code lost:
    
        if (r324 >= r0) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0bbf, code lost:
    
        if ((r326 & 255) >= 128) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0bd4, code lost:
    
        ((X.MMw) X.JQx.A0t(r0, r322, r324)).A8t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bdd, code lost:
    
        r326 = r326 >> 8;
        r324 = r324 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0bef, code lost:
    
        if (r0 != 8) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0bf6, code lost:
    
        if (r322 == r0) goto L820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0bf9, code lost:
    
        r322 = r322 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0c51, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0c47, code lost:
    
        r306 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0c49, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0c02, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0c07, code lost:
    
        androidx.compose.runtime.Recomposer.A03(null, r0, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0c3a, code lost:
    
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A01(r0, r0, r0, r0, r0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0c41, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0c5f, code lost:
    
        if (r0.A01 == 0) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0d7a, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0d7d, code lost:
    
        androidx.compose.runtime.Recomposer.A01(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0d83, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0d89, code lost:
    
        X.LEY.A00().A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0d90, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0d95, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0d9a, code lost:
    
        r0.A04 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0c62, code lost:
    
        r0 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0c69, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0c75, code lost:
    
        r0 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0c7e, code lost:
    
        if (r0 < 0) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0c81, code lost:
    
        r334 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0c89, code lost:
    
        r353 = r0[r334];
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0cab, code lost:
    
        if (((r353 & ((r353 ^ r0) << 7)) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0cae, code lost:
    
        r0 = X.JR0.A0G(r334, r0);
        r362 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0cc1, code lost:
    
        if (r362 >= r0) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0cd9, code lost:
    
        if ((r353 & 255) >= 128) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0cee, code lost:
    
        ((X.MMw) X.JQx.A0t(r0, r334, r362)).AEl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0cf7, code lost:
    
        r353 = r353 >> 8;
        r362 = r362 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0d11, code lost:
    
        if (r0 != 8) goto L822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0d18, code lost:
    
        if (r334 == r0) goto L823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0d1b, code lost:
    
        r334 = r334 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0d73, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0d24, code lost:
    
        r306 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0d29, code lost:
    
        androidx.compose.runtime.Recomposer.A03(null, r0, r306);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0d5c, code lost:
    
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A01(r0, r0, r0, r0, r0, r0, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0d63, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0d69, code lost:
    
        r306 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0d6b, code lost:
    
        r0.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0390, code lost:
    
        if (r308 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0db9, code lost:
    
        X.LDN.A03("Expected applyChanges() to have been called");
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0dc5, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0e17, code lost:
    
        throw new java.util.NoSuchElementException("List is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x08a7, code lost:
    
        r0 = r338.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x08ae, code lost:
    
        r355 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x08b8, code lost:
    
        if (r355 >= r0) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x08d4, code lost:
    
        if (((X.03Y) r338.get(r355)).second == null) goto L832;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x08d7, code lost:
    
        r355 = r355 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x08e0, code lost:
    
        r0 = X.1BL.A10(r338);
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x08e7, code lost:
    
        r0 = r338.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x08ee, code lost:
    
        r308 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x08f8, code lost:
    
        if (r308 >= r0) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x08fd, code lost:
    
        r338.get(r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0905, code lost:
    
        r308 = r308 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x090e, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0915, code lost:
    
        X.0QU.A0t(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x091c, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x091f, code lost:
    
        r0 = X.1BL.A10(r338);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0924, code lost:
    
        r0 = r338.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x092b, code lost:
    
        r342 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0935, code lost:
    
        if (r342 >= r0) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x093a, code lost:
    
        r0 = r338.get(r342);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0955, code lost:
    
        if (((X.03Y) r0).second == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x095a, code lost:
    
        r0.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0962, code lost:
    
        r342 = r342 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0969, code lost:
    
        r338 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x09ce, code lost:
    
        r338.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x09e1, code lost:
    
        throw X.AnonymousClass001.A0Q("getAnchor$runtime_release");
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0e4a, code lost:
    
        r306 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x01bc, code lost:
    
        continue;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M3x.invoke(java.lang.Object):java.lang.Object");
    }
}
