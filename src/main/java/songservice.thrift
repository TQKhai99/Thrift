struct SongStruct{
    1: i32 id,
    2: string title,
    3: list<string> singers,
    4: i32 stream = 0,
    5: i32 like = 0,
}

service SongService {
    bool put(1: string title, 2: list<string> singers),
    SongStruct get(1: i32 id),
    bool remove(1: i32 id),

    bool stream(1: i32 id),
    bool like(1: i32 id),
    bool unlike(1: i32 id),

    list<i32> getTop5(1: bool stream),
}