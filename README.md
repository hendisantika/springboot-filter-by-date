# springboot-filter-by-date

Demo on how to filter data by date (new Date not LocalDate or LocalDateTime)

## Things to do list:
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-filter-by-date.git`.
2. Go to your folder: `cd springboot-filter-by-date`.
3. Run the application: `mvn clean spring-boot:run`.
4. Open your favorite browser.

## API List

Get All Data 
```shell script
GET | http://localhost:8080/api/rekap
Request : curl http://localhost:8080/api/rekap/

Response:
[
  {
    "id": "4acd0915-1698-4c0c-81af-1ba8e0298230",
    "tanggal": "2020-04-07",
    "kode": "KD001",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "2cce0811-80a7-436f-896c-1929f692e583",
    "tanggal": "2020-04-06",
    "kode": "KD002",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "c7978f3d-8920-4c43-a6d4-8c4865a5526d",
    "tanggal": "2020-04-05",
    "kode": "KD003",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "a4755177-fead-4b0b-ac86-3cde0fa290f7",
    "tanggal": "2020-04-04",
    "kode": "KD004",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "122289ed-09da-40cc-b8e6-dfffdf7c8463",
    "tanggal": "2020-04-03",
    "kode": "KD005",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "707089bc-7016-4098-9591-565430911fb2",
    "tanggal": "2020-04-02",
    "kode": "KD006",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "aa9783d8-3755-413f-ae85-a16a5528517b",
    "tanggal": "2020-04-01",
    "kode": "KD007",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "915d7a79-4273-4463-ab1d-7ef9d9d63233",
    "tanggal": "2020-03-31",
    "kode": "KD008",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "fb457901-908c-443e-a738-915b7957c68e",
    "tanggal": "2020-03-30",
    "kode": "KD009",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  },
  {
    "id": "04ac9887-b467-4875-ae45-eaad25dcc817",
    "tanggal": "2020-03-29",
    "kode": "KD0010",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  }
]

```

Get All Data By Date
```shell script
GET | http://localhost:8080/api/rekap/findByDate/2020-04-07

Request:

curl http://localhost:8080/api/rekap/findByDate/2020-04-07 | jq .

Response:

[
  {
    "id": "4acd0915-1698-4c0c-81af-1ba8e0298230",
    "tanggal": "2020-04-07",
    "kode": "KD001",
    "terisi": 50,
    "sisa": 10,
    "catat": "10:13:04"
  }
]
```
