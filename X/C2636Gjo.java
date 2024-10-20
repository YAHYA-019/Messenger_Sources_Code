package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.facebook.graphql.enums.GraphQLXFBAIGenModelFailureType;
import com.facebook.graphql.enums.GraphQLXFBMsgrSafetyInterventionComponentButtonStyleType;
import com.facebook.rsys.callmanager.gen.AppInfo;
import com.google.common.collect.ImmutableList;
import java.io.File;

/* renamed from: X.Gjo, reason: case insensitive filesystem */
/* loaded from: Gjo.class */
public final class C2636Gjo extends C04v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C2636Gjo(8Ls r302, 8Jj r303, String str) {
        this.A00 = 3;
        11T.A0F(str, 2);
        this.A02 = r302;
        this.A03 = str;
        this.A01 = r303;
    }

    public C2636Gjo(Bitmap bitmap, 2EU r303, String str) {
        this.A00 = 7;
        this.A01 = bitmap;
        this.A03 = str;
        this.A02 = r303;
    }

    public C2636Gjo(Rect rect, EN8 en8, String str) {
        this.A00 = 0;
        11T.A0F(str, 3);
        this.A02 = rect;
        this.A01 = en8;
        this.A03 = str;
    }

    public C2636Gjo(Uri uri, File file) {
        this.A00 = 4;
        this.A03 = "image/*";
        this.A02 = uri;
        this.A01 = file;
    }

    public C2636Gjo(View.OnClickListener onClickListener, 2MQ r303, String str) {
        this.A00 = 1;
        this.A02 = r303;
        this.A03 = str;
        this.A01 = onClickListener;
    }

    public C2636Gjo(GraphQLXFBAIGenModelFailureType graphQLXFBAIGenModelFailureType, ImmutableList immutableList, String str, int i) {
        this.A00 = i;
        11T.A0F(immutableList, 1);
        this.A02 = immutableList;
        this.A01 = graphQLXFBAIGenModelFailureType;
        this.A03 = str;
    }

    public C2636Gjo(GraphQLXFBMsgrSafetyInterventionComponentButtonStyleType graphQLXFBMsgrSafetyInterventionComponentButtonStyleType, 8Lr r303, String str) {
        this.A00 = 9;
        this.A03 = str;
        this.A02 = graphQLXFBMsgrSafetyInterventionComponentButtonStyleType;
        this.A01 = r303;
    }

    public C2636Gjo(AppInfo appInfo, Hj2 hj2, String str) {
        this.A00 = 5;
        11T.A0F(appInfo, 2);
        this.A03 = str;
        this.A01 = appInfo;
        this.A02 = hj2;
    }

    public C2636Gjo(ImmutableList immutableList, Boolean bool, String str) {
        this.A00 = 8;
        11T.A0F(str, 1);
        this.A03 = str;
        this.A01 = bool;
        this.A02 = immutableList;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2636Gjo(String str, Boolean bool) {
        this((ImmutableList) null, bool, str);
        this.A00 = 8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2636Gjo.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public int hashCode() {
        int A05;
        Object obj;
        int A03;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass002.A05(this.A01, 1BL.A03(this.A02));
                A03 = this.A03.hashCode();
                return A03 + A05;
            case 1:
                A05 = AnonymousClass002.A07(this.A03, 1BL.A03(this.A02));
                obj = this.A01;
                A03 = obj.hashCode();
                return A03 + A05;
            case 2:
            case 6:
                A03 = (1BL.A03(this.A02) + AnonymousClass001.A02(this.A01)) * 31;
                A05 = 7zN.A05(this.A03);
                return A03 + A05;
            case 3:
                A05 = AnonymousClass002.A07(this.A03, 1BL.A03(this.A02));
                obj = this.A01;
                A03 = obj.hashCode();
                return A03 + A05;
            case 4:
                A05 = AnonymousClass002.A05(this.A02, 4YV.A02(this.A03));
                obj = this.A01;
                A03 = obj.hashCode();
                return A03 + A05;
            case 5:
            case 7:
            case 8:
            default:
                return super.hashCode();
            case 9:
                A05 = AnonymousClass002.A05(this.A02, 4YV.A02(this.A03));
                obj = this.A01;
                A03 = obj.hashCode();
                return A03 + A05;
        }
    }

    public String toString() {
        if (4 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FileData(mimeType=");
        A0k.append(this.A03);
        A0k.append(", uri=");
        A0k.append(this.A02);
        A0k.append(", file=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
