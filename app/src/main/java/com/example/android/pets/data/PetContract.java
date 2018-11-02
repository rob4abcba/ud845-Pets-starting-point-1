package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public final class PetContract {

    //Content Authority that helps identify the content provider.
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    //BASE_CONTENT_URI to be used with every Uri associated with PetContract.
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    //A constant to store the path for each of the tables.
    public static final String PATH_PETS = "pets";

    private PetContract() {
    }

    public static final class PetsEntry implements BaseColumns {

        //Full URI for the class that contains the scheme and content authority.
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of pets.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single pet.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;


        //Name of the table the data is being taken from.
        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;

        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        public static boolean isValidGender(int gender) {

            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }

    }
}
