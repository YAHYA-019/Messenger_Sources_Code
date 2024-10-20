package X;

import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.collect.ImmutableList;

/* renamed from: X.58t, reason: invalid class name */
/* loaded from: 58t.class */
public final class C58t implements 55E {
    public final PicSquare A00;

    public C58t(PicSquare picSquare) {
        this.A00 = picSquare;
    }

    public boolean BVi(55E r302) {
        if (r302.getClass() != C58t.class) {
            return false;
        }
        ImmutableList immutableList = this.A00.mPicSquareUrlsWithSizes;
        ImmutableList immutableList2 = ((C58t) r302).A00.mPicSquareUrlsWithSizes;
        if (immutableList.size() != immutableList2.size()) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= immutableList.size()) {
                return true;
            }
            if (!((PicSquareUrlWithSize) immutableList.get(i2)).url.equals(((PicSquareUrlWithSize) immutableList2.get(i2)).url)) {
                return false;
            }
            i = i2 + 1;
        }
    }
}
