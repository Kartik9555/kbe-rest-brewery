This project is to support learning about Restful APIs. 

### Commands
``` docker build -f ./DOCKERFILE -t kbe-rest .```

``` docker run -p 8080:8080 -d kbe-rest ```

From layers
``` docker build -f ./src/main/docker/DOCKERFILE -t kbe-rest . ```

Kubernetes:
-----------
Get all contexts:
``` kubectl config get-contexts ```

Use a context:
``` kubectl config use-context rancher-desktop ```

Create a deployment:
``` kubectl create deployment kbe-rest --image kartik9555/kbe-rest-brewery --dry-run=client -o=yaml>deployment.yml ``` 
Run the deployment:
``` kubectl apply -f deployment.yml ``` 

Create a service:
``` kubectl create service clusterip kbe-rest --tcp=8080:8080 --dry-run=client -o=yaml>service.yml ```
Run the service:
``` kubectl apply -f service.yml ```

Port Forwarding:
``` kubectl port-forward service/kbe-rest 8080:8080 ``` 

Terminating service and deployments:
``` kubectl delete service kbe-rest ```
``` kubectl delete deployment kbe-rest ``` 

Replacing ClusterIP with NodePort in the service.yml file offers an alternative method to expose the service, allowing direct accessibility without the need for port forwarding.

Accessing logs:
---------------
Docker:
docker logs [containerId]
docker logs -f [containerId]

Kubernetes:
kubectl logs --tail=20 [podId]
kubectl logs -f [podId]