# FlipperProjectSample

ゼロから作るとてもシンプルなFlipper Pluginのサンプルです。
Androidのデモアプリと、Flipper Pluginのサンプル実装が含まれています。

## Flipper Pluginのパッケージング方法

flipper-plugin-my-plugin ディレクトリの中で次のコマンドを実行すると、パッケージングされたtarファイルができます。
```shell
$ npx flipper-pkg pack
```
できたtarをFlipperのAdd Pluginメニューを経由してインストールしてください。
その後にAndroidアプリケーションのデバッグビルドを起動すると、Flipperに「接続されたよ！！」というメッセージが出ます。
