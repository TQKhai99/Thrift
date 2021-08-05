struct SongStruct{
    1: i32 id,
    2: string title,
    3: list<string> singers,
    4: i32 stream = 0,
    5: i32 like = 0,
}
struct SongResult{
    1: required i32 error,
    2: optional SongStruct song,
    3: optional list<i32> listsong,
}
service SongService {
    i32 put(1: string title, 2: list<string> singers),
    SongResult get(1: i32 id),
    i32 remove(1: i32 id),

    i32 stream(1: i32 id),
    i32 like(1: i32 id),
    i32 unlike(1: i32 id),

    SongResult getTop5Stream(),
    SongResult getTop5Like(),
    SongResult getListSongOfSinger(1: string name),
}