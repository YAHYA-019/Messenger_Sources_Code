package X;

import com.facebook.privacy.acs.falco.FalcoACSProvider;

/* loaded from: DJ5.class */
public interface DJ5 {
    public static final 1Dj A01 = AbF.A0F(FalcoACSProvider.TAG, "TEXT NOT NULL");
    public static final 1Dj A00 = AbF.A0F("node_id", "INTEGER NOT NULL REFERENCES edges(_id) ON DELETE CASCADE");
}
