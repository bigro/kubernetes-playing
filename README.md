# kubernetes-playing
この辺を参考にローカルの環境を作ってみる

- https://medium.com/@gorlemkun/ローカルにkubernetes環境を構築して-無をデプロイする-da114447801b
- https://github.com/kubernetes/ingress-nginx/blob/master/docs/deploy/index.md

## docker registryをローカルに構築
https://qiita.com/Brutus/items/da63d23be32d505409c6

## 動かし方
### ローカル
環境変数がないと動かないので以下のよう一時的に設定して動かす。

`env HELLO_USER=username HELLO_PASSWORD=pass ./gradlew bootRun`
### Kubernetes
docker buildする。

`docker build -t demo .`

タグ付けする

`docker tag demo localhost:5000/hello-app`

Dockerレジストリにアップロード（Dockerレジストリは[ここ](https://qiita.com/Brutus/items/da63d23be32d505409c6)を見てローカルに作成する）

`docker push localhost:5000/hello-app`

Kubernetesにデプロイ

`kubectl apply -f deploy/hello-secret.yaml`

`kubectl apply -f deploy/hello-deployment.yaml`

