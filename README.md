# Java Mssql Codespace
### File structure
```
.
├── .devcontainer
│   ├── Dockerfile
│   ├── devcontainer.json
│   ├── devcontainer2.json
│   ├── docker-compose.yml
│   └── mssql
│       ├── installSQLtools.sh
│       └── postCreateCommand.sh
├── .git
│   ├── FETCH_HEAD
│   ├── HEAD
│   ├── branches
│   ├── config
│   ├── description
│   ├── hooks
│   │   ├── applypatch-msg.sample
│   │   ├── commit-msg.sample
│   │   ├── fsmonitor-watchman.sample
│   │   ├── post-update.sample
│   │   ├── pre-applypatch.sample
│   │   ├── pre-commit.sample
│   │   ├── pre-merge-commit.sample
│   │   ├── pre-push.sample
│   │   ├── pre-rebase.sample
│   │   ├── pre-receive.sample
│   │   ├── prepare-commit-msg.sample
│   │   ├── push-to-checkout.sample
│   │   └── update.sample
│   ├── index
│   ├── info
│   │   └── exclude
│   ├── logs
│   │   ├── HEAD
│   │   └── refs
│   │       ├── heads
│   │       │   └── main
│   │       └── remotes
│   │           └── origin
│   │               └── main
│   ├── objects
│   │   ├── 02
│   │   │   └── 4481835920fe02eb7e0659d7b6d3fc3cb99198
│   │   ├── 1d
│   │   │   └── 953eeb3757330d0214308e4443a178e7bcc46a
│   │   ├── 2f
│   │   │   └── 1229f85dd8a369d89a4f6a8e477bb9d5ecec85
│   │   ├── 43
│   │   │   └── 1965355e8a19759db07bfc87c23244257dcd68
│   │   ├── 47
│   │   │   └── cc8ce55c5b0f5f771eed7d3001122eb11d1da0
│   │   ├── 51
│   │   │   └── c02c998bcab8422ad1f29cebc493bd9b5e4b89
│   │   ├── 57
│   │   │   └── cf528cc0f8c3c7373b33e8f468d264abaeb213
│   │   ├── 5c
│   │   │   └── 76bb1e1c4485594ca41b94d1b635f121973e25
│   │   ├── 65
│   │   │   └── 6b8ba314da22499312b6c928ac78a8c01feee1
│   │   ├── 6f
│   │   │   └── c6ceb87dd69e3fc0cf9ea46ad1c7ef75901e75
│   │   ├── 82
│   │   │   └── f7e0b4b84ebd72abdbbedd3515b5f6223fb397
│   │   ├── 88
│   │   │   └── 22ad5a4f0652115fd80286719d0394f5a387e0
│   │   ├── 8d
│   │   │   └── 3339f0cf95112a41aa3596cb3eca4a15a3eef5
│   │   ├── 93
│   │   │   └── 29caa6d684c18dcaaf38449e0d445068b07ebd
│   │   ├── a6
│   │   │   └── 3f062cc0b350a843f804ce0949407209f7b112
│   │   ├── af
│   │   │   └── 80bb5f9b73f86ce1c1bdf790a326b376d677e0
│   │   ├── be
│   │   │   └── e6d8b4b12ac2262982ea2943c5d55fdfd48622
│   │   ├── d7
│   │   │   └── 336f93a7038569a3615198547f7c3ddf958ddb
│   │   ├── e6
│   │   │   └── 9de29bb2d1d6434b8b29ae775ad8c2e48c5391
│   │   ├── e8
│   │   │   └── aff04f7f8dcf70a8c7d7a7b44daeeb73d272d9
│   │   ├── ed
│   │   │   └── f6914d8cf53c7f027c83aea8a1f924d9176c05
│   │   ├── f4
│   │   │   └── 655bd854333c5deaa181f7748525ff10b502c3
│   │   ├── f6
│   │   │   └── 6e556a95d3ed3d5ceb624332a6dced88e43180
│   │   ├── f9
│   │   │   └── f39e6d4a2d80d1ef38d2b78bf62439e0acfa02
│   │   ├── info
│   │   └── pack
│   ├── refs
│   │   ├── heads
│   │   │   └── main
│   │   ├── remotes
│   │   │   └── origin
│   │   │       └── main
│   │   └── tags
│   └── shallow
├── .gitignore
├── 01-CreateDatabase.sql
├── Main.java
├── README.md
├── TryDbProjects
│   ├── Script.PostDeployment.InsertUsers.sql
│   ├── TryDbProjects.sqlproj
│   └── Users.sql
├── compile.sh
└── infrastructure
    └── createAzureSQLServer.sh

45 directories, 64 files
```
