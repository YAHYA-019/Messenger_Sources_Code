package X;

import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3Qj, reason: invalid class name */
/* loaded from: 3Qj.class */
public final class C3Qj {
    public static final 3Kl A01 = new 3Kl(ImmutableList.of(), -1);
    public static final 3Km A00 = new 3Km(ImmutableList.of(), -1);

    public 3Kl A00(ImmutableList immutableList, long j) {
        immutableList.getClass();
        int size = immutableList.size();
        int size2 = immutableList.size();
        int i = 0;
        while (true) {
            if (i >= size2) {
                break;
            }
            if (((MontageBucketPreview) immutableList.get(i)).A02.A00 != j) {
                i++;
            } else if (i >= 0) {
                Preconditions.checkPositionIndex(i, size);
                MontageBucketPreview montageBucketPreview = (MontageBucketPreview) immutableList.get(i);
                if (!montageBucketPreview.A0A) {
                    MontageBucketPreview montageBucketPreview2 = null;
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (int i2 = 0; i2 < size; i2++) {
                        MontageBucketPreview montageBucketPreview3 = (MontageBucketPreview) immutableList.get(i2);
                        if (i2 != 0 || !montageBucketPreview3.A0A) {
                            builder.m11011add((Object) montageBucketPreview3);
                            if (Objects.equal(montageBucketPreview3.A02, montageBucketPreview.A02)) {
                                montageBucketPreview2 = montageBucketPreview3;
                            }
                        }
                    }
                    ImmutableList build = builder.build();
                    int indexOf = build.indexOf(montageBucketPreview2);
                    Preconditions.checkElementIndex(indexOf, build.size(), "Initial item missing from play queue");
                    return new 3Kl(build, indexOf);
                }
                ImmutableList.Builder builder2 = ImmutableList.builder();
                builder2.m11011add((Object) montageBucketPreview);
                ImmutableList.Builder builder3 = ImmutableList.builder();
                ImmutableList.Builder builder4 = ImmutableList.builder();
                for (int i3 = 0; i3 < immutableList.size(); i3++) {
                    MontageBucketPreview montageBucketPreview4 = (MontageBucketPreview) immutableList.get(i3);
                    if (!montageBucketPreview4.A0A) {
                        if (montageBucketPreview4.A09) {
                            builder3.m11011add((Object) montageBucketPreview4);
                        } else {
                            builder4.m11011add((Object) montageBucketPreview4);
                        }
                    }
                }
                ImmutableList build2 = builder3.build();
                if (build2.isEmpty()) {
                    build2 = builder4.build();
                }
                builder2.addAll(build2);
                return new 3Kl(builder2.build(), 0);
            }
        }
        return A01;
    }
}
