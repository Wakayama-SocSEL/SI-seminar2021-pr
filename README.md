# SI-seminar2021-pr
SIセミナー2021プログラミング班リポジトリ

メモ：Gradleプロジェクト生成コマンド
```sh
mkdir seminar
cd seminar
gradle init --type java-application \
  --dsl groovy \
  --test-framework junit \
  --project-name seminar \
  --package com.example.seminar
```

実行
```
$ gradle run
```

テスト
```
$ gradle test
```
