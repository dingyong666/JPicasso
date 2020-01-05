package cn.lmcw.jpicasso.entity;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "UploadImage".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class UploadImageCursor extends Cursor<UploadImage> {
    @Internal
    static final class Factory implements CursorFactory<UploadImage> {
        @Override
        public Cursor<UploadImage> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new UploadImageCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final UploadImage_.UploadImageIdGetter ID_GETTER = UploadImage_.__ID_GETTER;


    private final static int __ID_path = UploadImage_.path.id;
    private final static int __ID_fileSize = UploadImage_.fileSize.id;
    private final static int __ID_isCompress = UploadImage_.isCompress.id;
    private final static int __ID_creatTime = UploadImage_.creatTime.id;
    private final static int __ID_uploaderIp = UploadImage_.uploaderIp.id;
    private final static int __ID_hash = UploadImage_.hash.id;
    private final static int __ID_status = UploadImage_.status.id;
    private final static int __ID_attribute = UploadImage_.attribute.id;

    public UploadImageCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, UploadImage_.__INSTANCE, boxStore);
    }

    @Override
    public final long getId(UploadImage entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @Override
    public final long put(UploadImage entity) {
        String path = entity.getPath();
        int __id1 = path != null ? __ID_path : 0;
        String uploaderIp = entity.getUploaderIp();
        int __id5 = uploaderIp != null ? __ID_uploaderIp : 0;
        String hash = entity.getHash();
        int __id6 = hash != null ? __ID_hash : 0;
        String status = entity.getStatus();
        int __id7 = status != null ? __ID_status : 0;

        collect400000(cursor, 0, PUT_FLAG_FIRST,
                __id1, path, __id5, uploaderIp,
                __id6, hash, __id7, status);

        String attribute = entity.getAttribute();
        int __id8 = attribute != null ? __ID_attribute : 0;

        long __assignedId = collect313311(cursor, entity.id, PUT_FLAG_COMPLETE,
                __id8, attribute, 0, null,
                0, null, 0, null,
                __ID_fileSize, entity.getFileSize(), __ID_creatTime, entity.getCreatTime(),
                __ID_isCompress, entity.isCompress() ? 1 : 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0);

        entity.id = __assignedId;

        return __assignedId;
    }

}