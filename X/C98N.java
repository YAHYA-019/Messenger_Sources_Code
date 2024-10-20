package X;

/* renamed from: X.98N, reason: invalid class name */
/* loaded from: 98N.class */
public enum C98N implements C07n {
    ADMIN_MESSAGE("admin_message"),
    ALBUM_DELETE_DIALOG("album_delete_dialog"),
    ALBUM_MENU("album_menu"),
    ALBUM_RENAME_DIALOG("album_rename_dialog"),
    ALBUM_VIEWER_GRID("album_viewer_grid"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_VIEWER_MENU("album_viewer_list"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_VIEWER_MENU("album_viewer_reply_composer"),
    ALBUM_VIEWER_SELECT("album_viewer_select"),
    ALL_ALBUMS_LIST("all_albums_list"),
    BOTTOM_SHEET_ADD_TO("bottom_sheet_add_to"),
    BOTTOM_SHEET_CREATE("bottom_sheet_create"),
    BOTTOM_SHEET_NUX("bottom_sheet_nux"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_VIEWER_MENU("camera_roll"),
    COMPOSER_MEDIA_PICKER_ADD_BUTTON("composer_media_picker_add_button"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_VIEWER_MENU("contribution_menu"),
    MEDIA_VIEWER("media_viewer"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_VIEWER_MENU("media_viewer_menu"),
    MESSAGE_CONTEXT_MENU("message_context_menu"),
    MUSTACHE_NUX("mustache_nux"),
    REACTIONS_BAR("reactions_bar"),
    RECENT_ALBUMS_LIST("recent_albums_list"),
    REMOVE_CONTRIBUTIONS_DIALOG("remove_contributions_dialog"),
    XMA("xma");

    public final String mValue;

    C98N(String str) {
        this.mValue = str;
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
