package X;

import com.facebook.wearable.mediastream.ul.voltron.loader.MediaStreamLibraryLoader;
import kotlin.jvm.functions.Function2;

/* loaded from: G94.class */
public final class G94 extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G94(MIo mIo, MediaStreamLibraryLoader mediaStreamLibraryLoader, 0DR r304, boolean z) {
        super(2, r304);
        this.A03 = 2;
        this.A04 = mediaStreamLibraryLoader;
        this.A01 = mIo;
        this.A02 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G94(S47 s47, 0DR r303) {
        super(2, r303);
        this.A03 = 1;
        this.A04 = s47;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G94(Object obj, 0DR r303, int i, boolean z) {
        super(2, r303);
        this.A03 = i;
        this.A04 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        boolean z;
        int i;
        switch (this.A03) {
            case 0:
                obj2 = this.A04;
                z = this.A02;
                i = 0;
                G94 g94 = new G94(obj2, r303, i, z);
                g94.A01 = obj;
                return g94;
            case 1:
                return new G94((S47) this.A04, r303);
            case 2:
                return new G94((MIo) this.A01, (MediaStreamLibraryLoader) this.A04, r303, this.A02);
            default:
                obj2 = this.A04;
                z = this.A02;
                i = 3;
                G94 g942 = new G94(obj2, r303, i, z);
                g942.A01 = obj;
                return g942;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x03d0, code lost:
    
        if (r304 == r0) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0441  */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, X.0CL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G94.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
