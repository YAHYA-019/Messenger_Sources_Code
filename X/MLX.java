package X;

import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;

/* loaded from: MLX.class */
public interface MLX {
    public static final 1Dj A09 = AbF.A0F("_id", "INTEGER PRIMARY KEY");
    public static final 1Dj A00 = AbF.A0F("confirmed_model", "INTEGER NOT NULL");
    public static final 1Dj A03 = AbF.A0F("optimistic_model", "INTEGER NOT NULL");
    public static final 1Dj A02 = AbF.A0F("model_type", "BLOB NOT NULL");
    public static final 1Dj A04 = AbF.A0F("session_id", "TEXT NOT NULL");
    public static final 1Dj A07 = AbF.A0F("user_id", "TEXT NOT NULL");
    public static final 1Dj A01 = AbF.A0F("flags", "INTEGER");
    public static final 1Dj A08 = AbF.A0F(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, "INTEGER NOT NULL");
    public static final 1Dj A05 = AbF.A0F("sort_key", "TEXT NOT NULL");
    public static final 1Dj A06 = AbF.A0F("tags", "TEXT");
}
