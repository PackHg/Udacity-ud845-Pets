package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Pack Heng on 15/04/17
 * pack@oz-heng.com
 */

/**
 * API Contract for the Pets app.
 */
public final class PetContract {

    /**
     * An empty constructor to prevent the instantiation of this class.
     */
    private PetContract() {}

    public static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT= "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
