package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hry.class */
public final class Hry {
    public final MontageBucketPreview A00;
    public final ImmutableList A01;
    public final ImmutableList A02;

    public Hry(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        MontageBucketPreview montageBucketPreview = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MontageBucketPreview montageBucketPreview2 = (MontageBucketPreview) it.next();
                if (montageBucketPreview2.A0A) {
                    Preconditions.checkState(AnonymousClass001.A1U(montageBucketPreview), "Multiple 'my montage' items found in input list");
                    montageBucketPreview = montageBucketPreview2;
                } else if (montageBucketPreview2.A09) {
                    builder.m11011add((Object) montageBucketPreview2);
                } else {
                    builder2.m11011add((Object) montageBucketPreview2);
                }
            }
        }
        this.A00 = montageBucketPreview;
        this.A02 = builder.build();
        this.A01 = builder2.build();
    }

    public int A00() {
        int i;
        if (this.A01.isEmpty()) {
            i = -1;
        } else {
            i = 1;
            if (this.A00 == null) {
                i = 0;
            }
            ImmutableList immutableList = this.A02;
            if (!immutableList.isEmpty()) {
                return i + immutableList.size() + 1;
            }
        }
        return i;
    }

    public MontageBucketPreview A01(int i) {
        int i2;
        if (i == A00()) {
            return null;
        }
        ImmutableList immutableList = this.A02;
        if (immutableList.isEmpty()) {
            i2 = -1;
        } else {
            i2 = 1;
            if (this.A00 == null) {
                i2 = 0;
            }
        }
        if (i == i2 || i < 0) {
            return null;
        }
        MontageBucketPreview montageBucketPreview = this.A00;
        int i3 = AnonymousClass001.A1T(montageBucketPreview) ? 1 : 0;
        if (!immutableList.isEmpty()) {
            i3 = i3 + 1 + immutableList.size();
        }
        ImmutableList immutableList2 = this.A01;
        if (!immutableList2.isEmpty()) {
            i3 = i3 + 1 + immutableList2.size();
        }
        if (i >= i3) {
            return null;
        }
        if (montageBucketPreview != null && i == 0) {
            return montageBucketPreview;
        }
        int i4 = i - 1;
        if (montageBucketPreview != null) {
            i4--;
        }
        if (A00() == -1 || i <= A00()) {
            immutableList2 = immutableList;
            Preconditions.checkState(7zM.A1b(immutableList));
        } else if (!immutableList.isEmpty()) {
            i4 = (i4 - immutableList.size()) - 1;
        }
        return (MontageBucketPreview) immutableList2.get(i4);
    }
}
