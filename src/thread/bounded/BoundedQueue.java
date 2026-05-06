package thread.bounded;

public interface BoundedQueue {
    void put(String data); // 버퍼에 데이터 보관 (데이터 생산)

    String take(); // 버퍼에서 데이터 가져감 (데이터 소비)
}
