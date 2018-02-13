/**
 * Array based storage for Resumes
 */
public class ArrayStorage extends AbstractArrayStorage {


    @Override
    protected int getIndex(String uuid) {
        for (int i = 0; i < qualResume; i++) {
            if (uuid.equals(storage[i].getUuid())) {
                return i;
            }
        }
        return -1;
    }
}
