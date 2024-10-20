package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.3q6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3q6.class */
public abstract class AbstractC01143q6 {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature[] A08;

    static {
        long j = 3;
        Feature feature = new Feature("auth_blockstore", j);
        A00 = feature;
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        A01 = feature2;
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        A02 = feature3;
        long j2 = 2;
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", j2);
        A03 = feature4;
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        A04 = feature5;
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        A05 = feature6;
        Feature feature7 = new Feature("blockstore_delete_bytes", j2);
        A06 = feature7;
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", j);
        A07 = feature8;
        A08 = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
